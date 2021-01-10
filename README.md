# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 11-01-analisando-e-definindo-melhor-o-escopo-das-transacoes
git add .
git commit -m "Analisando e definindo melhor o escopo das transações"
git push origin 11-01-analisando-e-definindo-melhor-o-escopo-das-transacoes

git checkout master
git merge --no-ff 11-01-analisando-e-definindo-melhor-o-escopo-das-transacoes
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