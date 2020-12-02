# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 03-17-mapeando-relacionamento-com-manytoone
git add .
git commit -m "Mapeando relacionamento com @ManyToOne"
git push origin 03-17-mapeando-relacionamento-com-manytoone

git checkout master
git merge --no-ff 03-17-mapeando-relacionamento-com-manytoone
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