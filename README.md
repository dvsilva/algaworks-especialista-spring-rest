# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 15-11-publicando-domain-events-a-partir-do-aggregate-root
git add .
git commit -m "Publicando Domain Events a partir do Aggregate Root"
git push origin 15-11-publicando-domain-events-a-partir-do-aggregate-root

git checkout master
git merge --no-ff 15-11-publicando-domain-events-a-partir-do-aggregate-root
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```